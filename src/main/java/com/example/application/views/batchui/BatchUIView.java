package com.example.application.views.batchui;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("Batch UI")
@Route(value = "Batch-UI", layout = MainLayout.class)
public class BatchUIView extends VerticalLayout {

    public BatchUIView() {
        setSpacing(false);

        ComboBox<String> comboBox = new ComboBox<>("Batch Service");
        comboBox.getStyle().set("--vaadin-combo-box-overlay-width", "350px");
        add(comboBox);

        add( new H1("Batch Service"));

    }

}
