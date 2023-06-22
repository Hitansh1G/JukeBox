package com.sample.codingame.appConfig;

import com.sample.codingame.commands.AttendContestCommand;
import com.sample.codingame.commands.CommandInvoker;
import com.sample.codingame.commands.CreateContestCommand;
import com.sample.codingame.commands.CreateQuestionCommand;
import com.sample.codingame.commands.CreateUserCommand;
import com.sample.codingame.commands.LeaderBoardCommand;
import com.sample.codingame.commands.ListContestCommand;
import com.sample.codingame.commands.ListQuestionCommand;
import com.sample.codingame.commands.RunContestCommand;
import com.sample.codingame.commands.WithdrawContestCommand;
import com.sample.codingame.repositories.ContestRepository;
import com.sample.codingame.repositories.IContestRepository;
import com.sample.codingame.repositories.IQuestionRepository;
import com.sample.codingame.repositories.IUserRepository;
import com.sample.codingame.repositories.QuestionRepository;
import com.sample.codingame.repositories.UserRepository;
import com.sample.codingame.services.ContestService;
import com.sample.codingame.services.IContestService;
import com.sample.codingame.services.IQuestionService;
import com.sample.codingame.services.IUserService;
import com.sample.codingame.services.QuestionService;
import com.sample.codingame.services.UserService;

public class ApplicationConfig {
    private final IQuestionRepository questionRepository = new QuestionRepository();
    private final IUserRepository userRepository = new UserRepository();
    private final IContestRepository contestRepository = new ContestRepository();

    private final IQuestionService questionService = new QuestionService(questionRepository);
    private final IUserService userService = new UserService(userRepository, contestRepository);
    private final IContestService contestService = new ContestService(contestRepository, questionRepository, userRepository, userService);
    
    private final CreateUserCommand createUserCommand = new CreateUserCommand(userService);
    private final CreateQuestionCommand createQuestionCommand = new CreateQuestionCommand(questionService);
    private final ListQuestionCommand listQuestionCommand = new ListQuestionCommand(questionService);
    private final CreateContestCommand createContestCommand = new CreateContestCommand(contestService);
    private final ListContestCommand listContestCommand = new ListContestCommand(contestService);
    private final AttendContestCommand attendContestCommand = new AttendContestCommand(userService);
    private final RunContestCommand runContestCommand = new RunContestCommand(contestService);
    private final LeaderBoardCommand leaderBoardCommand = new LeaderBoardCommand(userService);
    private final WithdrawContestCommand withdrawContestCommand = new WithdrawContestCommand(userService);

    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("CREATE_USER",createUserCommand);
        commandInvoker.register("CREATE_QUESTION",createQuestionCommand);
        commandInvoker.register("LIST_QUESTION",listQuestionCommand);
        commandInvoker.register("CREATE_CONTEST",createContestCommand);
        commandInvoker.register("LIST_CONTEST",listContestCommand);
        commandInvoker.register("ATTEND_CONTEST",attendContestCommand);
        commandInvoker.register("RUN_CONTEST",runContestCommand);
        commandInvoker.register("LEADERBOARD",leaderBoardCommand);
        commandInvoker.register("WITHDRAW_CONTEST",withdrawContestCommand);
        return commandInvoker;
    }
}
