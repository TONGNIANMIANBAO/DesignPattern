package com.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * �h����ɫ��map��ŽK�Y���_ʽ��ֵ
 * 
 * @author SEN.CHEN
 *
 */
public class Context {
	Map<Variable, Integer> map = new HashMap<>();

	public void assign(Variable var, Integer val) {
		map.put(var, val);
	}

	public int lookup(Variable variable) {
		if (map.get(variable) != null) {
			return map.get(variable);
		}
		return 0;
	}

}
