import java.util.Random;

public class NamesGenerator {
    public static void main(String[] args) {
        String[] names = {"Олександр", "Володимир", "Андрій", "Дмитро", "Юрій", "Сергій", "Іван", "Михайло", "Віктор", "Тарас"};
        String[] lastnames = {"Шевченко", "Коваленко", "Бойко", "Ткаченко", "Гончарук", "Мельник", "Кравченко", "Олійник", "Петренко", "Зайцев"};
        String[] patronymics = {"Олександрович", "Володимирович", "Андрійович", "Дмитрович", "Юрійович", "Сергійович", "Іванович", "Михайлович", "Вікторович", "Тарасович"};

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            sb.append(i + 1).append(".\t")
                    .append(lastnames[random.nextInt(lastnames.length)]).append("\t")
                    .append(names[random.nextInt(names.length)]).append("\t")
                    .append(patronymics[random.nextInt(patronymics.length)]).append("\n");
        }

        String fullnames = sb.toString();
        System.out.println(fullnames);
    }
}