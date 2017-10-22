package pkg360.practice;

public class Practice {
   public static void main(String[] args) {

      // Create a model
      Book model = new Book();

      // Create a view
      BookView view = new BookView();

      // Create a controller
      BookController controller = new BookController(model, view);

	  // Controller calls to run program
      controller.defaultView();
      controller.promptNewBook();
      controller.updateView();
      controller.promptNewBook();
      controller.updateView();
   }

}