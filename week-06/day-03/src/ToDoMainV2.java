
public class ToDoMainV2 {
  public static void main(String[] args) {
    ArgumentHandler newArgHandler = new ArgumentHandler(args);
    Helpprinter newHelpPrinter = new Helpprinter();
    ToDo toDoHandler = new ToDo();

    if (newArgHandler.noArgs()) {
      newHelpPrinter.print();
    } else if (newArgHandler.isList()) {
      toDoHandler.printToDoS();
    } else if (newArgHandler.isAdd()) {
      System.out.println("ez lesz a hozzaadas");
    } else if (newArgHandler.isRemove()) {
      System.out.println("ez lesz a torles");
    } else if (newArgHandler.isComplete()) {
      System.out.println("ez lesz a pipalas");
    }
  }
}