package Project;

import java.util.Stack;

public class UndoStack {

	public static void main(String[] args) {
		Stack<String> UndoStack=new Stack<String>();
		UndoStack.push("write");
		UndoStack.push("Delete");
		UndoStack.push("insert");
		System.out.println(UndoStack);
		System.out.println(	UndoStack.peek());
		UndoStack.peek();
		UndoStack.pop();
		UndoStack.pop();
		System.out.println(UndoStack);
	}

}
