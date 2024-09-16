import java.util.Scanner;

public class FirstAddressExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of a top 10 phone brand: ");
        String brand = scanner.nextLine();

        switch (brand.toLowerCase()) {
            case "apple":
                System.out.println("XYZ Company");
                System.out.println("8900 U.S. Hwy 14");
                System.out.println("Crystal Lake, IL 60014");
                System.out.println("Company: Apple Inc.");
                 break;
            case "samsung":
                System.out.println("Samsung Electronics Co., Ltd.");
                System.out.println("129,Samsung-ro, Yeongtong-gu");
                System.out.println("Suwon-si, Gyeonggi-do");
                System.out.println("South Korea");
                break;
            case "xiaomi":
              System.out.println("Xiaomi Corporation");
                System.out.println("No. 7, Zhongguancun East Road, Haidian District");
                System.out.println("Beijing, China");
                break;
            case "oppo":
               System.out.println("OPPO Electronics Corp., Ltd.");
                System.out.println("Songshan Lake High-Tech Development Zone");
                System.out.println("Dongguan, Guangdong, China");
                break;
            case "vivo":
                System.out.println("Vivo Communication Technologies Co., Ltd.");
                System.out.println("Vivo Industrial Park");
                System.out.println("Songshan Lake High-Tech Development Zone");
                System.out.println("Dongguan, Guangdong, China");
                break;
            case "realme":
                 System.out.println("Realme Technology Co., Ltd.");
                System.out.println("No. 501, Building A, Shennan Avenue");
                System.out.println("Futian District, Shenzhen, China");
                break;
            case "huawei":
                System.out.println("Huawei Technologies Co., Ltd.");
                System.out.println("Huawei Headquarters");
                System.out.println("Bantian Street, Longgang District");
                System.out.println("Shenzhen, Guangdong, China");
                break;
            case "oneplus":
                System.out.println("OnePlus Technology (Shenzhen) Co., Ltd..");
                System.out.println("18th Floor, Block C, Tairan Building");
                System.out.println("Tairan 8th Road, Chegongmiao");
                System.out.println("Futian District, Shenzhen, China");
                break;
            case "motorola":
                System.out.println("Motorola Solutions, Inc.");
                System.out.println("500 West Algonquin Road");
                System.out.println("Schaumburg, IL 60196");
                System.out.println("USA");
                break;
            case "google":
                System.out.println("Googleplex");
                System.out.println("1600 Amphitheatre Parkway");
                System.out.println("SMountain View, CA 94043");
                System.out.println("USA");
                break;
            default:
                System.out.println("Invalid brand. Please enter a valid top 10 phone brand.");
        scanner.close();
        }
    }
}