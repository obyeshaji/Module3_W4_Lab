package edu.farmingdale.module3_w4_lab;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Welcome to FarmingDale");

        showSplashScreen();
        primaryStage.show();
    }

    private void showSplashScreen() {
        StackPane splashRoot = new StackPane();
        splashRoot.setId("splash-screen");

        VBox progressBox = new VBox(10);
        progressBox.setId("progress-box");
        progressBox.setAlignment(Pos.CENTER);

        ProgressBar progressBar = new ProgressBar(0.7);
        progressBar.getStyleClass().add("progress-bar");

        Label progressLabel = new Label("70%");
        progressBox.getChildren().addAll(progressBar, progressLabel);

        splashRoot.getChildren().add(progressBox);


        splashRoot.setOnMouseClicked(e -> showLoginScreen());

        Scene splashScene = new Scene(splashRoot, 900, 600);
        splashScene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        primaryStage.setScene(splashScene);
    }

    private void showLoginScreen() {
        StackPane loginRoot = new StackPane();
        loginRoot.setId("login-screen");

        VBox loginForm = new VBox(10);
        loginForm.setId("login-form");
        loginForm.setAlignment(Pos.CENTER_LEFT);
        loginForm.setPadding(new Insets(20));


        Label userLabel = new Label("Username:");
        TextField userField = new TextField();
        userField.getStyleClass().add("text-field");


        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();
        passField.getStyleClass().add("password-field");


        Button loginButton = new Button("Login");
        Button cancelButton = new Button("Cancel");
        loginButton.getStyleClass().add("button");
        cancelButton.getStyleClass().add("button");

        loginForm.getChildren().addAll(
                userLabel, userField,
                passLabel, passField,
                loginButton, cancelButton
        );

        loginRoot.getChildren().add(loginForm);

        Scene loginScene = new Scene(loginRoot, 900, 600);
        loginScene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        primaryStage.setScene(loginScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}