package Creational.singleton;

public class Main {


    public static void main(String[] args) {

        SettingManager settings = SettingManager.getInstance();
        settings.set("name", "Yannick");

        System.out.println(settings.get("name"));

        SettingManager settings2 = SettingManager.getInstance();
        System.out.println(settings2.get("name"));

    }

}
