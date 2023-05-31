package modelo_teste1;

import modelo_teste1.*;

import java.util.Optional;

public class TTMCspDemo3 {
	
	public static void main(String[] args) {
		int caso = 1;
		int pc=0;
		int pt=1;
		int px=0;
		int estag=0;
		int tra=0;
		int estud=2;
		int pales=4;
		int vol=5;
		int out=0;
		CSP<Variable, String> csp = new DiscenteTeste3(caso,pc,pt,px,estag,tra,estud,pales,vol,out);
		CspListener.StepCounter<Variable, String> stepCounter = new CspListener.StepCounter<>();
		CspSolver<Variable, String> solver;
		Optional<Assignment<Variable, String>> solution;
		
		System.out.println("Caso "+caso + "(Conflitos Minimos)");
		solver = new MinConflictsSolver<>(1000);
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		solution = solver.solve(csp);
		if (solution.isPresent())
			System.out.println((solution.get().isSolution(csp) ? ":-) " : ":-( ") + solution.get());
		System.out.println(stepCounter.getResults() + "\n");
		
		
		
		//caso = 1;
		//pc=1;
		csp = new DiscenteTeste3(caso,pc,pt,px,estag,tra,estud,pales,vol,out);
		System.out.println("Caso "+caso + "(Backtracking)");
		solver = new FlexibleBacktrackingSolver<>();
		solver.addCspListener(stepCounter);
		stepCounter.reset();
		solution = solver.solve(csp);
		if (solution.isPresent())
			System.out.println(solution.get());
		System.out.println(stepCounter.getResults() + "\n");
	}

}
