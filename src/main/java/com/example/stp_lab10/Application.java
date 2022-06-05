package com.example.stp_lab10;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Scanner;

public class Application extends javafx.application.Application {
    private static void Start(){
        System.out.println("\nCompleted by student AT-212 \nOdessa Polytechnic University \nVykhodets Roman \n\nVariant 1 \n\n");
        System.out.println("Создать класс квадрат, члены класса – длина стороны.\nПредусмотреть в классе методы вычисления и вывода сведений о фигуре – диагональ, периметр, площадь.\nСоздать производный класс – правильная квадратная призма с высотой H,\nдобавить в класс метод определения объема фигуры, перегрузить методы расчета площади и вывода сведений о фигуре.\nНаписать программу, демонстрирующую работу с этими классами:\n\tдано N квадратов и M призм, найти квадрат с максимальной площадью и призму с максимальной диагональю.\n\n");
    }

    public static void main(String[] args) {
        javafx.application.Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scanner scan = new Scanner(System.in);

        Start();

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Lab 10");
        stage.getIcons().add(new Image("file:icon.png"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}