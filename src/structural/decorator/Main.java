package structural.decorator;

public class Main {

    public static void main(String[] args) {

//        var data = new CompressedCloudStream( new CloudStream());
//        data.write("Cool stuff");
//
//        System.out.println(data);

        storeCard(new CompressedCloudStream(new EncryptedCloudStream(new CloudStream())));
    }


    public static void storeCard(Stream stream) {
        stream.write("12345");
    }
}
