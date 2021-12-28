package com.zachgoshen.workouttracker.domain.set.specification;

import java.util.Optional;

import com.zachgoshen.workouttracker.domain.common.specification.Specification;
import com.zachgoshen.workouttracker.domain.set.Set;

public class MinimumTimeRestedSpecification extends Specification<Set> {
	
	private final float minimumRestTime;
	
	public MinimumTimeRestedSpecification(float restTime) {
		this.minimumRestTime = restTime;
	}

	@Override
	public boolean isSatisfiedBy(Set candidate) {
		Optional<Float> timeRested = candidate.getTimeRested();
		
		return timeRested.isPresent() && timeRested.get() >= minimumRestTime;
	}

}