public class Book {
  private String title;
  private double price;
  private Author author;

  public Book(String title, double price, Author author) {
      this.title = title;
      this.price = price;
      this.author = author;
  }

  public String getTitle() {
      return title;
  }

  public double getPrice() {
      return price;
  }

  public Author getAuthor() {
      return author;
  }

  @Override
  public String toString() {
      return "Book{" +
             "title='" + title + '\'' + 
             ", price=" + price + 
             ", author=" + author +
             '}';
  }
}
