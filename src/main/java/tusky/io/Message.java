package tusky.io;

public enum Message {
    LINE("____________________________________________________________"),
    WELCOME(" Hello! I'm Tusky the Walrus"),
    GOODBYE(" Bye. Hope to see you again soon!"),
    TASK_ADDED(" Got it. I've added this task:\n"),
    TASK_COUNT(" Now you have %d tasks in the list.\n"),
    TASK_LIST(" Here are the tasks in your list:"),
    TASK_MARKED(" Nice! I've marked this task as done:"),
    TASK_UNMARKED(" OK, I've marked this task as not done yet:"),

    // File related
    FILE_LOADED(" Welcome back, I have found your previous tasks"),
    FILE_CREATED(" A new customer, what can I do for you?"),

    // Errors
    ERR_MAX_TASKS_EXCEEDED(" Too many tasks!"),
    ERR_INVALID_INDEX(" Invalid index!"),
    ERR_KEY_NOT_FOUND(" You missed out your \"%s\" argument!"),
    ERR_UNKNOWN_COMMAND(" Sorry I don't recognise that command."),
    ERR_UNKNOWN_EXCEPTION(" Something went wrong: "),
    ERR_EMPTY_TASK_DESCRIPTION(" The body of a %s cannot be empty!\n"),
    ERR_INVALID_PARAMETERS(" Sorry something is wrong with your input, please try again\n");



    private final String text;

    Message(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        return text;
    }
}
