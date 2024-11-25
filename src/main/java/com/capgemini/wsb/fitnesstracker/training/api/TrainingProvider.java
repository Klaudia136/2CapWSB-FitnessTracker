package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.internal.ActivityType;
import java.time.LocalDate;
import java.util.List;

public interface TrainingProvider {
    List<Training> findAllTrainings();
    Training createTraining(Training training);
}
