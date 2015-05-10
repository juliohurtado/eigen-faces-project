package csc450Lib.linalg.sle;

public enum LinearSystemStatus {
	ILL_CONDITIONED_MATRIX,
	LINEAR_SOLVER_FAILED,
	LINEAR_SOLVER_SUCCEDED,
	REGULAR_MATRIX,
	SINGULAR_MATRIX,
	UNKNOWN_STATUS;
}