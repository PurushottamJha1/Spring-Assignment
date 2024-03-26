package com.SpringAssignment5.SpringAssignment5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class TrainModel {
    public static List<Trainer> getAllTrainersWithSessions() throws SQLException {
        List<Trainer> trainers = new ArrayList<>();
        String query = "SELECT trainer.trainer_id, trainer.first_name, session.id AS session_id, session.name AS session_name " +
                "FROM trainer " +
                "LEFT JOIN session ON trainer.trainer_id = session.trainer_id";
        try (Connection connection = database.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                int trainerId = resultSet.getInt("trainer_id");
                String trainerName = resultSet.getString("first_name");
                SessionClass session = new SessionClass(trainerId, trainerName);
                session.setId(resultSet.getInt("trainer_id"));
                session.setName(resultSet.getString("session_name"));
                Trainer trainer = null;
                for (Trainer t : trainers) {
                    if (t.getId() == trainerId) {
                        trainer = t;
                        break;
                    }
                }
                if (trainer == null) {
                    trainer = new Trainer(trainerId, trainerName);
                    trainer.setId(trainerId);
                    trainer.setName(trainerName);
                    trainer.setSessions(new ArrayList<>());
                    trainers.add(trainer);
                }
                trainer.getSessions().add(session);
            }
        }
        return trainers;
    }
}