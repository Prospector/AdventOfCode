import java.util.ArrayList;
import java.util.List;

public class Day1 {
	public static final String INPUT = "+12\n"
		+ "-10\n"
		+ "-4\n"
		+ "-8\n"
		+ "+18\n"
		+ "-1\n"
		+ "-13\n"
		+ "+10\n"
		+ "-13\n"
		+ "+5\n"
		+ "+7\n"
		+ "+6\n"
		+ "+14\n"
		+ "-9\n"
		+ "-8\n"
		+ "+7\n"
		+ "+18\n"
		+ "-11\n"
		+ "+13\n"
		+ "-1\n"
		+ "+20\n"
		+ "+11\n"
		+ "+13\n"
		+ "-2\n"
		+ "+3\n"
		+ "-8\n"
		+ "-16\n"
		+ "+4\n"
		+ "-6\n"
		+ "-3\n"
		+ "-9\n"
		+ "-12\n"
		+ "+16\n"
		+ "+17\n"
		+ "-5\n"
		+ "-11\n"
		+ "+2\n"
		+ "-20\n"
		+ "-15\n"
		+ "+5\n"
		+ "+3\n"
		+ "+11\n"
		+ "-13\n"
		+ "-18\n"
		+ "-13\n"
		+ "-6\n"
		+ "-19\n"
		+ "+6\n"
		+ "-15\n"
		+ "-11\n"
		+ "+16\n"
		+ "+1\n"
		+ "+15\n"
		+ "+5\n"
		+ "-18\n"
		+ "+14\n"
		+ "-5\n"
		+ "-15\n"
		+ "-3\n"
		+ "+11\n"
		+ "-17\n"
		+ "+19\n"
		+ "+12\n"
		+ "+5\n"
		+ "+8\n"
		+ "-2\n"
		+ "+10\n"
		+ "+13\n"
		+ "+8\n"
		+ "+19\n"
		+ "+8\n"
		+ "+17\n"
		+ "-6\n"
		+ "+8\n"
		+ "+4\n"
		+ "-9\n"
		+ "+19\n"
		+ "+13\n"
		+ "+11\n"
		+ "-2\n"
		+ "+20\n"
		+ "+3\n"
		+ "-16\n"
		+ "-18\n"
		+ "+3\n"
		+ "-5\n"
		+ "-15\n"
		+ "+18\n"
		+ "+18\n"
		+ "+9\n"
		+ "-18\n"
		+ "-19\n"
		+ "+17\n"
		+ "-16\n"
		+ "+15\n"
		+ "-12\n"
		+ "+2\n"
		+ "-20\n"
		+ "+7\n"
		+ "-3\n"
		+ "-9\n"
		+ "+10\n"
		+ "+4\n"
		+ "+20\n"
		+ "-13\n"
		+ "-17\n"
		+ "-23\n"
		+ "+7\n"
		+ "+18\n"
		+ "+21\n"
		+ "+16\n"
		+ "+17\n"
		+ "+5\n"
		+ "-14\n"
		+ "+19\n"
		+ "-18\n"
		+ "-10\n"
		+ "+7\n"
		+ "+1\n"
		+ "-13\n"
		+ "+16\n"
		+ "-21\n"
		+ "+12\n"
		+ "+19\n"
		+ "+11\n"
		+ "-5\n"
		+ "+14\n"
		+ "+11\n"
		+ "-9\n"
		+ "+19\n"
		+ "-2\n"
		+ "-7\n"
		+ "+3\n"
		+ "-20\n"
		+ "+9\n"
		+ "-16\n"
		+ "+9\n"
		+ "+10\n"
		+ "+17\n"
		+ "-18\n"
		+ "-12\n"
		+ "-11\n"
		+ "-11\n"
		+ "+20\n"
		+ "-18\n"
		+ "-12\n"
		+ "-5\n"
		+ "-7\n"
		+ "+15\n"
		+ "+20\n"
		+ "+18\n"
		+ "+23\n"
		+ "+17\n"
		+ "-7\n"
		+ "+5\n"
		+ "-7\n"
		+ "+8\n"
		+ "-2\n"
		+ "-15\n"
		+ "+5\n"
		+ "-17\n"
		+ "+1\n"
		+ "-5\n"
		+ "-8\n"
		+ "+7\n"
		+ "+15\n"
		+ "+5\n"
		+ "+1\n"
		+ "+15\n"
		+ "-11\n"
		+ "-1\n"
		+ "+17\n"
		+ "+15\n"
		+ "+18\n"
		+ "+7\n"
		+ "-3\n"
		+ "-16\n"
		+ "-7\n"
		+ "+18\n"
		+ "-6\n"
		+ "+17\n"
		+ "-2\n"
		+ "+20\n"
		+ "-2\n"
		+ "-7\n"
		+ "-17\n"
		+ "+20\n"
		+ "-1\n"
		+ "+8\n"
		+ "-16\n"
		+ "-12\n"
		+ "-6\n"
		+ "-3\n"
		+ "+19\n"
		+ "+19\n"
		+ "+18\n"
		+ "-7\n"
		+ "+17\n"
		+ "+5\n"
		+ "+19\n"
		+ "-15\n"
		+ "-13\n"
		+ "+2\n"
		+ "+14\n"
		+ "+2\n"
		+ "+1\n"
		+ "+13\n"
		+ "-7\n"
		+ "+2\n"
		+ "-10\n"
		+ "-10\n"
		+ "-15\n"
		+ "+9\n"
		+ "+9\n"
		+ "+14\n"
		+ "+7\n"
		+ "+4\n"
		+ "-15\n"
		+ "-5\n"
		+ "-17\n"
		+ "-5\n"
		+ "-9\n"
		+ "+13\n"
		+ "+6\n"
		+ "+2\n"
		+ "-15\n"
		+ "-11\n"
		+ "+17\n"
		+ "-19\n"
		+ "+14\n"
		+ "-13\n"
		+ "+3\n"
		+ "+1\n"
		+ "-18\n"
		+ "-15\n"
		+ "-17\n"
		+ "-12\n"
		+ "+13\n"
		+ "-17\n"
		+ "+5\n"
		+ "-9\n"
		+ "+2\n"
		+ "+5\n"
		+ "-8\n"
		+ "-8\n"
		+ "-19\n"
		+ "+11\n"
		+ "+20\n"
		+ "+11\n"
		+ "+16\n"
		+ "-7\n"
		+ "+20\n"
		+ "+3\n"
		+ "-21\n"
		+ "-8\n"
		+ "-11\n"
		+ "-9\n"
		+ "+8\n"
		+ "-15\n"
		+ "-20\n"
		+ "-20\n"
		+ "-17\n"
		+ "+24\n"
		+ "+17\n"
		+ "-12\n"
		+ "-20\n"
		+ "-12\n"
		+ "-3\n"
		+ "+14\n"
		+ "-18\n"
		+ "+13\n"
		+ "-74\n"
		+ "-19\n"
		+ "-13\n"
		+ "+2\n"
		+ "+23\n"
		+ "-13\n"
		+ "+24\n"
		+ "-17\n"
		+ "-5\n"
		+ "+14\n"
		+ "-10\n"
		+ "-2\n"
		+ "-10\n"
		+ "-7\n"
		+ "-6\n"
		+ "-23\n"
		+ "-10\n"
		+ "-3\n"
		+ "+9\n"
		+ "-11\n"
		+ "+8\n"
		+ "+16\n"
		+ "-8\n"
		+ "-28\n"
		+ "-10\n"
		+ "+17\n"
		+ "-9\n"
		+ "-10\n"
		+ "-9\n"
		+ "-8\n"
		+ "+2\n"
		+ "+5\n"
		+ "-19\n"
		+ "+11\n"
		+ "-16\n"
		+ "+8\n"
		+ "-14\n"
		+ "-5\n"
		+ "+8\n"
		+ "+4\n"
		+ "-3\n"
		+ "+8\n"
		+ "-7\n"
		+ "+4\n"
		+ "+1\n"
		+ "-2\n"
		+ "-7\n"
		+ "+15\n"
		+ "+3\n"
		+ "+10\n"
		+ "+4\n"
		+ "+1\n"
		+ "-14\n"
		+ "-18\n"
		+ "+15\n"
		+ "-21\n"
		+ "+3\n"
		+ "+14\n"
		+ "-15\n"
		+ "-13\n"
		+ "-14\n"
		+ "-6\n"
		+ "+15\n"
		+ "+1\n"
		+ "+11\n"
		+ "+26\n"
		+ "+19\n"
		+ "-16\n"
		+ "+5\n"
		+ "-2\n"
		+ "-9\n"
		+ "+12\n"
		+ "+19\n"
		+ "-11\n"
		+ "+23\n"
		+ "-3\n"
		+ "+15\n"
		+ "-13\n"
		+ "+14\n"
		+ "-9\n"
		+ "-26\n"
		+ "+17\n"
		+ "+63\n"
		+ "-4\n"
		+ "-20\n"
		+ "-10\n"
		+ "-39\n"
		+ "-55\n"
		+ "-6\n"
		+ "-15\n"
		+ "-9\n"
		+ "-16\n"
		+ "-17\n"
		+ "-14\n"
		+ "-12\n"
		+ "+21\n"
		+ "+1\n"
		+ "-2\n"
		+ "-16\n"
		+ "-13\n"
		+ "-21\n"
		+ "+26\n"
		+ "+27\n"
		+ "+17\n"
		+ "+6\n"
		+ "+2\n"
		+ "-18\n"
		+ "+1\n"
		+ "+18\n"
		+ "+25\n"
		+ "-3\n"
		+ "+19\n"
		+ "-35\n"
		+ "-26\n"
		+ "+4\n"
		+ "-48\n"
		+ "-3\n"
		+ "+1\n"
		+ "+20\n"
		+ "+8\n"
		+ "-27\n"
		+ "-25\n"
		+ "-8\n"
		+ "-10\n"
		+ "-24\n"
		+ "+3\n"
		+ "-61\n"
		+ "+64\n"
		+ "+17\n"
		+ "+21\n"
		+ "+84\n"
		+ "+49\n"
		+ "+4\n"
		+ "-233\n"
		+ "-2\n"
		+ "+535\n"
		+ "+55053\n"
		+ "-1\n"
		+ "-12\n"
		+ "+2\n"
		+ "-19\n"
		+ "+13\n"
		+ "+10\n"
		+ "+10\n"
		+ "+15\n"
		+ "-12\n"
		+ "+13\n"
		+ "+15\n"
		+ "+8\n"
		+ "-15\n"
		+ "-13\n"
		+ "+10\n"
		+ "-7\n"
		+ "+3\n"
		+ "-10\n"
		+ "+16\n"
		+ "+12\n"
		+ "-6\n"
		+ "+4\n"
		+ "+3\n"
		+ "+19\n"
		+ "+14\n"
		+ "+2\n"
		+ "+10\n"
		+ "+4\n"
		+ "+16\n"
		+ "-2\n"
		+ "-8\n"
		+ "+18\n"
		+ "-14\n"
		+ "-1\n"
		+ "+4\n"
		+ "-1\n"
		+ "+15\n"
		+ "+10\n"
		+ "-6\n"
		+ "+17\n"
		+ "+17\n"
		+ "+15\n"
		+ "+8\n"
		+ "+15\n"
		+ "+6\n"
		+ "+9\n"
		+ "+19\n"
		+ "-2\n"
		+ "+13\n"
		+ "-19\n"
		+ "-15\n"
		+ "-6\n"
		+ "-15\n"
		+ "-4\n"
		+ "-10\n"
		+ "-1\n"
		+ "-4\n"
		+ "-18\n"
		+ "+15\n"
		+ "-2\n"
		+ "+3\n"
		+ "+13\n"
		+ "+5\n"
		+ "+14\n"
		+ "+15\n"
		+ "-19\n"
		+ "+7\n"
		+ "+13\n"
		+ "-14\n"
		+ "-11\n"
		+ "+10\n"
		+ "+8\n"
		+ "+13\n"
		+ "-16\n"
		+ "+5\n"
		+ "-13\n"
		+ "-16\n"
		+ "+10\n"
		+ "-5\n"
		+ "-9\n"
		+ "-1\n"
		+ "+2\n"
		+ "+15\n"
		+ "-4\n"
		+ "-19\n"
		+ "-7\n"
		+ "+19\n"
		+ "+12\n"
		+ "+24\n"
		+ "+10\n"
		+ "+10\n"
		+ "+18\n"
		+ "+15\n"
		+ "+12\n"
		+ "-5\n"
		+ "-11\n"
		+ "+5\n"
		+ "+10\n"
		+ "-12\n"
		+ "-7\n"
		+ "-14\n"
		+ "+12\n"
		+ "-17\n"
		+ "-13\n"
		+ "-20\n"
		+ "+14\n"
		+ "-13\n"
		+ "+11\n"
		+ "-16\n"
		+ "+15\n"
		+ "+15\n"
		+ "+18\n"
		+ "-8\n"
		+ "+10\n"
		+ "+17\n"
		+ "+1\n"
		+ "-10\n"
		+ "+19\n"
		+ "+8\n"
		+ "+7\n"
		+ "+4\n"
		+ "+11\n"
		+ "+11\n"
		+ "-15\n"
		+ "-13\n"
		+ "+18\n"
		+ "-17\n"
		+ "+19\n"
		+ "+5\n"
		+ "-6\n"
		+ "-9\n"
		+ "+6\n"
		+ "+18\n"
		+ "-10\n"
		+ "+9\n"
		+ "-18\n"
		+ "-17\n"
		+ "-2\n"
		+ "-14\n"
		+ "-19\n"
		+ "-1\n"
		+ "-8\n"
		+ "-10\n"
		+ "-7\n"
		+ "-18\n"
		+ "+3\n"
		+ "+14\n"
		+ "+6\n"
		+ "+14\n"
		+ "-17\n"
		+ "+18\n"
		+ "+10\n"
		+ "+23\n"
		+ "+4\n"
		+ "-14\n"
		+ "+12\n"
		+ "-4\n"
		+ "-19\n"
		+ "+15\n"
		+ "+20\n"
		+ "-5\n"
		+ "+15\n"
		+ "+16\n"
		+ "-21\n"
		+ "+14\n"
		+ "-15\n"
		+ "-17\n"
		+ "-15\n"
		+ "+7\n"
		+ "+10\n"
		+ "+18\n"
		+ "+21\n"
		+ "+14\n"
		+ "+6\n"
		+ "+4\n"
		+ "+6\n"
		+ "+17\n"
		+ "-18\n"
		+ "-14\n"
		+ "-18\n"
		+ "-8\n"
		+ "+24\n"
		+ "+10\n"
		+ "+8\n"
		+ "-13\n"
		+ "+18\n"
		+ "+3\n"
		+ "-18\n"
		+ "-2\n"
		+ "-3\n"
		+ "-8\n"
		+ "-1\n"
		+ "-1\n"
		+ "-16\n"
		+ "+9\n"
		+ "-4\n"
		+ "+10\n"
		+ "+20\n"
		+ "+18\n"
		+ "+9\n"
		+ "-1\n"
		+ "+17\n"
		+ "-2\n"
		+ "+16\n"
		+ "+16\n"
		+ "-17\n"
		+ "+13\n"
		+ "+5\n"
		+ "-6\n"
		+ "-15\n"
		+ "-19\n"
		+ "+11\n"
		+ "-17\n"
		+ "-8\n"
		+ "+10\n"
		+ "-1\n"
		+ "+10\n"
		+ "-22\n"
		+ "-15\n"
		+ "+11\n"
		+ "+20\n"
		+ "-14\n"
		+ "+2\n"
		+ "+11\n"
		+ "+17\n"
		+ "+17\n"
		+ "+18\n"
		+ "-8\n"
		+ "+7\n"
		+ "+8\n"
		+ "-14\n"
		+ "+19\n"
		+ "-6\n"
		+ "+2\n"
		+ "+10\n"
		+ "+6\n"
		+ "+5\n"
		+ "+10\n"
		+ "+3\n"
		+ "-8\n"
		+ "-4\n"
		+ "-13\n"
		+ "-15\n"
		+ "-16\n"
		+ "-5\n"
		+ "-19\n"
		+ "+16\n"
		+ "-15\n"
		+ "+5\n"
		+ "-27\n"
		+ "-18\n"
		+ "+3\n"
		+ "-7\n"
		+ "+21\n"
		+ "-8\n"
		+ "-15\n"
		+ "-4\n"
		+ "-5\n"
		+ "-8\n"
		+ "+3\n"
		+ "+22\n"
		+ "+6\n"
		+ "+8\n"
		+ "+12\n"
		+ "-27\n"
		+ "+32\n"
		+ "-4\n"
		+ "+2\n"
		+ "+4\n"
		+ "-5\n"
		+ "+26\n"
		+ "-5\n"
		+ "-3\n"
		+ "-4\n"
		+ "+21\n"
		+ "+34\n"
		+ "+4\n"
		+ "-6\n"
		+ "+17\n"
		+ "-6\n"
		+ "+7\n"
		+ "+7\n"
		+ "+10\n"
		+ "-19\n"
		+ "+20\n"
		+ "+2\n"
		+ "+14\n"
		+ "+14\n"
		+ "+17\n"
		+ "+5\n"
		+ "+16\n"
		+ "-17\n"
		+ "+11\n"
		+ "-13\n"
		+ "-5\n"
		+ "+15\n"
		+ "+7\n"
		+ "-18\n"
		+ "-9\n"
		+ "-13\n"
		+ "-2\n"
		+ "-14\n"
		+ "-2\n"
		+ "-4\n"
		+ "-3\n"
		+ "-7\n"
		+ "+12\n"
		+ "+14\n"
		+ "-9\n"
		+ "+20\n"
		+ "+7\n"
		+ "+7\n"
		+ "+15\n"
		+ "+12\n"
		+ "-3\n"
		+ "-14\n"
		+ "-1\n"
		+ "+4\n"
		+ "-16\n"
		+ "+14\n"
		+ "-3\n"
		+ "-16\n"
		+ "-8\n"
		+ "+14\n"
		+ "+18\n"
		+ "+14\n"
		+ "-5\n"
		+ "-6\n"
		+ "+7\n"
		+ "+14\n"
		+ "+16\n"
		+ "-22\n"
		+ "-16\n"
		+ "-13\n"
		+ "-9\n"
		+ "-13\n"
		+ "-1\n"
		+ "-15\n"
		+ "-9\n"
		+ "-6\n"
		+ "+20\n"
		+ "+17\n"
		+ "+1\n"
		+ "-3\n"
		+ "+44\n"
		+ "+17\n"
		+ "+17\n"
		+ "+21\n"
		+ "+9\n"
		+ "+20\n"
		+ "-17\n"
		+ "+11\n"
		+ "+10\n"
		+ "-15\n"
		+ "+10\n"
		+ "+3\n"
		+ "+4\n"
		+ "+16\n"
		+ "+8\n"
		+ "-7\n"
		+ "+17\n"
		+ "+8\n"
		+ "+15\n"
		+ "-9\n"
		+ "+4\n"
		+ "+28\n"
		+ "+8\n"
		+ "-1\n"
		+ "-6\n"
		+ "-10\n"
		+ "-65\n"
		+ "+4\n"
		+ "-42\n"
		+ "-14\n"
		+ "-14\n"
		+ "-24\n"
		+ "-15\n"
		+ "+6\n"
		+ "+13\n"
		+ "-72\n"
		+ "-1\n"
		+ "-17\n"
		+ "-5\n"
		+ "+7\n"
		+ "-27\n"
		+ "+19\n"
		+ "-21\n"
		+ "-2\n"
		+ "+20\n"
		+ "-2\n"
		+ "+3\n"
		+ "-34\n"
		+ "+30\n"
		+ "+23\n"
		+ "-30\n"
		+ "-5\n"
		+ "+20\n"
		+ "-27\n"
		+ "+11\n"
		+ "-27\n"
		+ "-7\n"
		+ "-23\n"
		+ "+39\n"
		+ "-225\n"
		+ "+15\n"
		+ "+60\n"
		+ "+472\n"
		+ "+54569\n"
		+ "+1\n"
		+ "+15\n"
		+ "+13\n"
		+ "+6\n"
		+ "-10\n"
		+ "-13\n"
		+ "-2\n"
		+ "-6\n"
		+ "+13\n"
		+ "+2\n"
		+ "+5\n"
		+ "-10\n"
		+ "-5\n"
		+ "-11\n"
		+ "-1\n"
		+ "+18\n"
		+ "-12\n"
		+ "-15\n"
		+ "-7\n"
		+ "-1\n"
		+ "+13\n"
		+ "-18\n"
		+ "-1\n"
		+ "-5\n"
		+ "-2\n"
		+ "-14\n"
		+ "-5\n"
		+ "-4\n"
		+ "-16\n"
		+ "-10\n"
		+ "+8\n"
		+ "-1\n"
		+ "+20\n"
		+ "+11\n"
		+ "+15\n"
		+ "-3\n"
		+ "-17\n"
		+ "+8\n"
		+ "+11\n"
		+ "-6\n"
		+ "-9\n"
		+ "-8\n"
		+ "-11\n"
		+ "-1\n"
		+ "-13\n"
		+ "-3\n"
		+ "-8\n"
		+ "+12\n"
		+ "+18\n"
		+ "-11\n"
		+ "-17\n"
		+ "-12\n"
		+ "+6\n"
		+ "-7\n"
		+ "-3\n"
		+ "+15\n"
		+ "+9\n"
		+ "+13\n"
		+ "-14\n"
		+ "+18\n"
		+ "+20\n"
		+ "-6\n"
		+ "-12\n"
		+ "+2\n"
		+ "+20\n"
		+ "-12\n"
		+ "-23\n"
		+ "-17\n"
		+ "-7\n"
		+ "+1\n"
		+ "-24\n"
		+ "-17\n"
		+ "-7\n"
		+ "-18\n"
		+ "+3\n"
		+ "-13\n"
		+ "+14\n"
		+ "+2\n"
		+ "-12\n"
		+ "-16\n"
		+ "+2\n"
		+ "-35\n"
		+ "-3\n"
		+ "+2\n"
		+ "-18\n"
		+ "-14\n"
		+ "-13\n"
		+ "+10\n"
		+ "-3\n"
		+ "-17\n"
		+ "+4\n"
		+ "+23\n"
		+ "+16\n"
		+ "-7\n"
		+ "-30\n"
		+ "+29\n"
		+ "-19\n"
		+ "+18\n"
		+ "-3\n"
		+ "+20\n"
		+ "-7\n"
		+ "-3\n"
		+ "+77\n"
		+ "+1\n"
		+ "+42\n"
		+ "+18\n"
		+ "+9\n"
		+ "-1\n"
		+ "+23\n"
		+ "+57\n"
		+ "+8\n"
		+ "-12\n"
		+ "+1\n"
		+ "+5\n"
		+ "+12\n"
		+ "+3\n"
		+ "+10\n"
		+ "-1\n"
		+ "+14\n"
		+ "+20\n"
		+ "-7\n"
		+ "-3\n"
		+ "-14\n"
		+ "-12\n"
		+ "+9\n"
		+ "+16\n"
		+ "+16\n"
		+ "+12\n"
		+ "+14\n"
		+ "+11\n"
		+ "+11\n"
		+ "+2\n"
		+ "+1\n"
		+ "+19\n"
		+ "-10\n"
		+ "+18\n"
		+ "-17\n"
		+ "-9\n"
		+ "-11\n"
		+ "-8\n"
		+ "+10\n"
		+ "-1\n"
		+ "-110292";
	public static final String[] SPLIT = INPUT.split("\n");
	public static int currentIndex = 0;

	public static List<Integer> frequenciesReached = new ArrayList<>();

	public static void main(String[] args) {
		part2();
	}

	public static void part1() {
		int result = 0;
		String[] split = INPUT.split("\n");
		for (String s : split) {
			if (s.contains("+")) {
				s = s.split("/+")[0];
			}
			result += Integer.valueOf(s);
		}
		System.out.println(result);
	}

	public static void part2() {
		long startTime = System.currentTimeMillis();
		while (true) {
			if (frequenciesReached.isEmpty()) {
				frequenciesReached.add(nextNumber());
				currentIndex++;
			}
			int currentFrequency = frequenciesReached.get(frequenciesReached.size() - 1) + nextNumber();
			if (frequenciesReached.contains(currentFrequency)) {
				System.out.println(currentFrequency);
				System.out.println("In " + (System.currentTimeMillis() - startTime) + "ms");
				break;
			} else {
				frequenciesReached.add(currentFrequency);
				currentIndex++;
			}
		}
	}

	public static int nextNumber() {
		String str = SPLIT[currentIndex % SPLIT.length];
		if (str.contains("+")) {
			str = str.split("/+")[0];
		}
		return Integer.valueOf(str);
	}
}