package sjuJavaprojects;

public class StatsErrors {
	public double standardDev() 
    double mean = average()
    double sumSquaredDiffs = 0

    for (double num : data) {
        sumSquaredDiffs = sumSquaredDiffs + Math.pow(num - mean, 2)
    }

    return Math.sqrt(sumSquaredDiffs / data.length)
}
}
