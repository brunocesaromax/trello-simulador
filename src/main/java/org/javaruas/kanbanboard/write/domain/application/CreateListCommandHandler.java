package org.javaruas.kanbanboard.write.domain.application;

import org.javaruas.kanbanboard.write.domain.core.ListAggregate;

public class CreateListCommandHandler {

    private final ListAggregate listAggregate;

    public CreateListCommandHandler(ListAggregate listAggregate) {
        this.listAggregate = listAggregate;
    }

    public void handle(CreateListCommand createListCommand) {
        listAggregate.create(
                createListCommand.getId(),
                createListCommand.getPosition(),
                createListCommand.getName());
    }
}
