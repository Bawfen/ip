package tasks;

public enum TaskType {
    EVENT("event"),
    TODO("todo"),
    DEADLINE("deadline");

    private final String code;

    TaskType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String toString(){
        return code;
    }
}