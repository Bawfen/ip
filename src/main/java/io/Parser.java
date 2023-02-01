package io;
import java.util.HashMap;
import java.util.Map;

public class Parser {
    private Map<String, String> valueMap;
    private String body;
    private String command;

    public Parser(){}

    public void parse(String input){
        this.valueMap = new HashMap<>();
        String[] inputs = input.split(" ",2);
        command = inputs[0];
        if(inputs.length > 1){
            String[] args = inputs[1].split(" /");
            body = args[0];
            for(int i =1; i< args.length; i++){
                String[] words = args[i].split(" ", 2);
                valueMap.put(words[0], words[1]);
            }
        }

    }

    public String get(String key){
        return valueMap.get(key);
    }

    public String getBody() {
        return body;
    }

    public String getCommand() {
        return command;
    }
}
