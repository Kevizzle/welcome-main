package com.example.application.views.myteam;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("My Team")
@Route(value = "My-Team", layout = MainLayout.class)
public class MyTeamView extends VerticalLayout {

    public MyTeamView() {
        setSpacing(false);

       VerticalLayout todosList = new VerticalLayout();
        TextField taskField = new TextField();
        Button addButton = new Button("Add");
        addButton.addClickListener(click -> {
            Checkbox checkbox = new Checkbox(taskField.getValue());
            todosList.add(checkbox);
        });
        addButton.addClickShortcut(Key.ENTER);
        add(
                new H1("The Conquerors"),
                todosList,
                new HorizontalLayout(
                        taskField,
                        addButton
                )
        );
    }

}
