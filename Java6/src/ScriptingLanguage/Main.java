package ScriptingLanguage;

import javax.script.*;

public class Main {

	public static void main(String[] args) {
		final ScriptEngineManager manager = new  ScriptEngineManager();
		final ScriptEngine engine = manager.getEngineByName("js");
		try {
		   System.out.println(engine.eval("engine.getClass().getSimpleName()"));
		   System.out.println(engine.eval("5+5"));
		   engine.put("x", 123423558);
		   engine.put("y", 4);
		   engine.eval("var result = x.toExponential(y);");
		   System.out.println(engine.get("result"));
		}catch (ScriptException e) {
		   e.printStackTrace();
		}
	}

}
