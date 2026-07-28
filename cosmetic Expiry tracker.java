import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class CosmeticExpiryTracker extends Frame implements ActionListener {

    TextField productName, expiryDate;
    Button addProduct, checkExpiry;
    TextArea productList;

    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> dates = new ArrayList<>();

    CosmeticExpiryTracker() {
        setTitle("Cosmetic Expiry Tracker");
        setSize(500,500);
        setLayout(new FlowLayout());

        add(new Label("COSMETIC EXPIRY TRACKER"));

        add(new Label("Product Name"));
        productName = new TextField(20);
