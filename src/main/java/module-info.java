module Kalkulator {
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;

	exports com.responsywnie.Kalkulator.main to javafx.graphics;
    opens com.responsywnie.Kalkulator.controller to javafx.fxml;
}
