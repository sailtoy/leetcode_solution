package leetcode_solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem_056 {
	public static void main(String[] args) {
		Problem_056 p = new Problem_056();
		List<Interval> list = new ArrayList<Interval>();
		list.add(p.new Interval(1, 4));
		list.add(p.new Interval(0, 4));
		//list.add(p.new Interval(3, 6));
		List<Interval> r = p.merge(list);
		System.out.println(r);
	}

	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<Interval>();
		if (intervals == null || intervals.isEmpty())
			return result;

		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start < o2.start ? -1 : (o1.start == o2.start ? 0 : 1) ;
			}
		});

		Interval sentinel = intervals.get(0);
		if (intervals.size() == 1) {
			result.add(sentinel);
		}
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
			if (sentinel.start == curr.start) {
				if (sentinel.end < curr.end)
					sentinel.end = curr.end;
			} else {
				if (sentinel.end < curr.start) {
					result.add(sentinel);
					sentinel = curr;
				} else {
					if (sentinel.end <= curr.end)
						sentinel.end = curr.end;
				}
			}
			if (i == intervals.size() - 1) {
				result.add(sentinel);
			}
		}
		return result;
	}

	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}
}
