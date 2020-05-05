package ex04.app;

import java.util.HashMap;
import java.util.Map;

public enum MarchaMecanica {
	PONTO_MORTO (0),
	PRIMEIRA (1),
	SEGUNDA (2),
	TERCEIRA (3),
	QUARTA (4),
	QUINTA (5),
	SEXTA (6);

	private Integer value;
	private static Map<Integer, MarchaMecanica> map = new HashMap<>();

    private MarchaMecanica(Integer value) {
        this.value = value;
    }

    static {
        for (MarchaMecanica marcha : MarchaMecanica.values()) {
            map.put(marcha.value, marcha);
        }
    }

	public static MarchaMecanica valueOf(Integer marcha) {
		return (MarchaMecanica) map.get(marcha);
	}

	public int getValue() {
		return value;
	}
}
