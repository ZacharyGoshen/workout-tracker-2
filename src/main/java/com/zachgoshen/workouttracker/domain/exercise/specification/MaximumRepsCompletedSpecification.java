package com.zachgoshen.workouttracker.domain.exercise.specification;

import java.util.Optional;

import com.zachgoshen.workouttracker.domain.common.specification.Specification;
import com.zachgoshen.workouttracker.domain.exercise.Exercise;

public class MaximumRepsCompletedSpecification extends Specification<Exercise> {
	
	private final int maximumReps;

	public MaximumRepsCompletedSpecification(int maximumReps) {
		this.maximumReps = maximumReps;
	}

	@Override
	public boolean isSatisfiedBy(Exercise candidate) {
		Optional<Integer> repsCompleted = candidate.getRepsCompleted();
		
		return repsCompleted.isPresent() && repsCompleted.get() <= maximumReps;
	}

}