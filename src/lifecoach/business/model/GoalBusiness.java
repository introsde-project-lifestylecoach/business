package lifecoach.business.model;

import lifecoach.localdb.webservice.Goal;

public class GoalBusiness 
{
	Goal goal;
	boolean done;
	
	public GoalBusiness(Goal goal, boolean done)
	{
		this.goal = goal;
		this.done = done;
	}
	
	public Goal getGoal() {
		return goal;
	}
	public void setGoal(Goal goal) {
		this.goal = goal;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}	
}
