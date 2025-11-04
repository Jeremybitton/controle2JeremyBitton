package sio.devoir2magazine.controllers;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.stereotype.Component;
import sio.devoir2magazine.dto.ArticlePigiste;
import sio.devoir2magazine.dto.MagazineSpecialite;
import sio.devoir2magazine.entities.Magazine;
import sio.devoir2magazine.services.ArticleService;
import sio.devoir2magazine.services.MagazineService;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class Devoir2Controller implements Initializable {


    private final MagazineService magazineService;
    private final ArticleService articleService;
    private Alert alert;

    @FXML
    private Button btnAjouterArticle;
    @FXML
    private TableColumn tcNomSpecialite;
    @FXML
    private TextField txtMontantMagazine;
    @FXML
    private ComboBox cboChoixPigiste;
    @FXML
    private TableColumn tcNbPages;
    @FXML
    private Slider sldNbPages;
    @FXML
    private TableView<MagazineSpecialite> tvMagazines;
    @FXML
    private TableColumn tcNumeroMagazine;
    @FXML
    private TableView<ArticlePigiste> tvArticles;
    @FXML
    private TextField txtMontantArticle;
    @FXML
    private TableColumn tcNomMagazine;
    @FXML
    private TableColumn tcNomPigiste;
    @FXML
    private TableColumn tcNomArticle;
    @FXML
    private TextField txtNomArticle;
    @FXML
    private TableColumn tcNumeroArticle;

    public Devoir2Controller(MagazineService magazineService, ArticleService articleService) {
        this.magazineService = magazineService;
        this.articleService = articleService;
    }

    @FXML
    public void tvArticlesClicked(Event event) {
        // A vous de jouer

    }

    @FXML
    public void btnAjouterArticleClicked(Event event) {
        // A vous de jouer

    }

    @FXML
    public void tvMagazinesClicked(Event event)
    {

        // A vous de jouer
        tvArticles.setItems(FXCollections.observableList(articleService.getAllArticlePigistes(tvMagazines.getSelectionModel().getSelectedItem().getNumMag())));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText("");

        // Le TableView des magazines
        tcNumeroMagazine.setCellValueFactory( new PropertyValueFactory<>("numMag"));
        tcNomMagazine.setCellValueFactory( new PropertyValueFactory<>("nomMag"));
        tcNomSpecialite.setCellValueFactory( new PropertyValueFactory<>("specialite"));

        // Le TableView des articles
        tcNumeroArticle.setCellValueFactory( new PropertyValueFactory<>("idArticle"));
        tcNomArticle.setCellValueFactory( new PropertyValueFactory<>("titreArticle"));
        tcNbPages.setCellValueFactory( new PropertyValueFactory<>("nbFeuillets"));
        tcNomPigiste.setCellValueFactory( new PropertyValueFactory<>("nomPigiste"));

        // A vous de jouer

        tvMagazines.setItems(FXCollections.observableList(magazineService.getAllMagazines()));


    }
}