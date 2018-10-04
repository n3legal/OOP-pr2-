public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Дэн Браун", "braun_den@google.com", 'M');
        System.out.println(a1);
        a1.setEmail("den-braun@google.com");
        System.out.println(a1);
        System.out.println(a1.getEmail());
    }
}