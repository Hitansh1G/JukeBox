package com.sample.codingame.exceptions;

public class InvalidContestException extends RuntimeException{
    public InvalidContestException()
 {
  super();
 }
 public InvalidContestException(String msg)
 {
  super(msg);
 }
}
