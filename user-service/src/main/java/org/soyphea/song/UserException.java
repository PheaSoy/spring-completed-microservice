package org.soyphea.song;

public class UserException extends RuntimeException {
    public UserException() {
    }

    public UserException(String message) {
        super("User :"+message+"Not found!!!!");
    }
}
