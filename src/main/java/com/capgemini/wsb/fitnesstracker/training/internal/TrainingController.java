package com.capgemini.wsb.fitnesstracker.training.internal;

import com.capgemini.wsb.fitnesstracker.training.api.Training;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1/trainings")
@RequiredArgsConstructor
class TrainingController {
    private final TrainingServiceImpl trainingService;

    @GetMapping("/simple")
    public List<Training> getAllTrainings() {
        return trainingService.findAllTrainings();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Training createTraining(@RequestBody Training training) {
        return trainingService.createTraining(training);
    }
}