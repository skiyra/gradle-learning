package com.yunbo.gia.todo;

import com.yunbo.gia.todo.utils.CommandLineInput;
import com.yunbo.gia.todo.utils.CommandLineInputHandler;

/**
 * Created by yunBo on 2018/9/10.
 */
public class ToDoApp {
	
	public static final char DEFAULT_INPUT = '\u0000';
	
	public static void main(String args[]) {
		CommandLineInputHandler commandLineInputHandler = new CommandLineInputHandler();
		char command = DEFAULT_INPUT;
		while (CommandLineInput.EXIT.getShortCmd() != command) {
			commandLineInputHandler.printOptions();
			String input = commandLineInputHandler.readInput();
			char[] inputChars = input.length() == 1 ? input.toCharArray() : new char[]{DEFAULT_INPUT};
			command = inputChars[0];
			CommandLineInput commandLineInput = CommandLineInput.getCommandLineInputForInput(command);
			commandLineInputHandler.processInput(commandLineInput);
		}
	}
	
}
