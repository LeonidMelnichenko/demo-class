public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.title = "пылесос";
        card1.url = "https//www.website.com";
        Description descriptionCard1 = new Description();
        descriptionCard1.price = 500;
        descriptionCard1.descriptoin = "самый лучший в мире пылесос";

        card1.description = descriptionCard1;
    }
}
