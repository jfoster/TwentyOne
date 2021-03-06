package twentyone.enums;

import java.awt.Color;

// Color codes from https://www.google.com/design/spec/style/color.html

public enum Colours {
	RED_50(0xFFEBEE),
	RED_100(0xFFCDD2),
	RED_200(0xEF9A9A),
	RED_300(0xE57373),
	RED_400(0xEF5350),
	RED_500(0xF44336),
	RED_600(0xE53935),
	RED_700(0xD32F2F),
	RED_800(0xC62828),
	RED_900(0xB71C1C),
	RED_A100(0xFF8A80),
	RED_A200(0xFF5252),
	RED_A400(0xFF1744),
	RED_A700(0xD50000),

	PINK_50(0xFCE4EC),
	PINK_100(0xF8BBD0),
	PINK_200(0xF48FB1),
	PINK_300(0xF06292),
	PINK_400(0xEC407A),
	PINK_500(0xE91E63),
	PINK_600(0xD81B60),
	PINK_700(0xC2185B),
	PINK_800(0xAD1457),
	PINK_900(0x880E4F),
	PINK_A100(0xFF80AB),
	PINK_A200(0xFF4081),
	PINK_A400(0xF50057),
	PINK_A700(0xC51162),

	PURPLE_50(0xF3E5F5),
	PURPLE_100(0xE1BEE7),
	PURPLE_200(0xCE93D8),
	PURPLE_300(0xBA68C8),
	PURPLE_400(0xAB47BC),
	PURPLE_500(0x9C27B0),
	PURPLE_600(0x8E24AA),
	PURPLE_700(0x7B1FA2),
	PURPLE_800(0x6A1B9A),
	PURPLE_900(0x4A148C),
	PURPLE_A100(0xEA80FC),
	PURPLE_A200(0xE040FB),
	PURPLE_A400(0xD500F9),
	PURPLE_A700(0xAA00FF),

	DEEP_PURPLE_50(0xEDE7F6),
	DEEP_PURPLE_100(0xD1C4E9),
	DEEP_PURPLE_200(0xB39DDB),
	DEEP_PURPLE_300(0x9575CD),
	DEEP_PURPLE_400(0x7E57C2),
	DEEP_PURPLE_500(0x673AB7),
	DEEP_PURPLE_600(0x5E35B1),
	DEEP_PURPLE_700(0x512DA8),
	DEEP_PURPLE_800(0x4527A0),
	DEEP_PURPLE_900(0x311B92),
	DEEP_PURPLE_A100(0xB388FF),
	DEEP_PURPLE_A200(0x7C4DFF),
	DEEP_PURPLE_A400(0x651FFF),
	DEEP_PURPLE_A700(0x6200EA),

	INDIGO_50(0xE8EAF6),
	INDIGO_100(0xC5CAE9),
	INDIGO_200(0x9FA8DA),
	INDIGO_300(0x7986CB),
	INDIGO_400(0x5C6BC0),
	INDIGO_500(0x3F51B5),
	INDIGO_600(0x3949AB),
	INDIGO_700(0x303F9F),
	INDIGO_800(0x283593),
	INDIGO_900(0x1A237E),
	INDIGO_A100(0x8C9EFF),
	INDIGO_A200(0x536DFE),
	INDIGO_A400(0x3D5AFE),
	INDIGO_A700(0x304FFE),

	BLUE_50(0xE3F2FD),
	BLUE_100(0xBBDEFB),
	BLUE_200(0x90CAF9),
	BLUE_300(0x64B5F6),
	BLUE_400(0x42A5F5),
	BLUE_500(0x2196F3),
	BLUE_600(0x1E88E5),
	BLUE_700(0x1976D2),
	BLUE_800(0x1565C0),
	BLUE_900(0x0D47A1),
	BLUE_A100(0x82B1FF),
	BLUE_A200(0x448AFF),
	BLUE_A400(0x2979FF),
	BLUE_A700(0x2962FF),

	LIGHT_BLUE_50(0xE1F5FE),
	LIGHT_BLUE_100(0xB3E5FC),
	LIGHT_BLUE_200(0x81D4FA),
	LIGHT_BLUE_300(0x4FC3F7),
	LIGHT_BLUE_400(0x29B6F6),
	LIGHT_BLUE_500(0x03A9F4),
	LIGHT_BLUE_600(0x039BE5),
	LIGHT_BLUE_700(0x0288D1),
	LIGHT_BLUE_800(0x0277BD),
	LIGHT_BLUE_900(0x01579B),
	LIGHT_BLUE_A100(0x80D8FF),
	LIGHT_BLUE_A200(0x40C4FF),
	LIGHT_BLUE_A400(0x00B0FF),
	LIGHT_BLUE_A700(0x0091EA),
	
	CYAN_50(0xE0F7FA),
	CYAN_100(0xB2EBF2),
	CYAN_200(0x80DEEA),
	CYAN_300(0x4DD0E1),
	CYAN_400(0x26C6DA),
	CYAN_500(0x00BCD4),
	CYAN_600(0x00ACC1),
	CYAN_700(0x0097A7),
	CYAN_800(0x00838F),
	CYAN_900(0x006064),
	CYAN_A100(0x84FFFF),
	CYAN_A200(0x18FFFF),
	CYAN_A400(0x00E5FF),
	CYAN_A700(0x00B8D4),

	TEAL_50(0xE0F2F1),
	TEAL_100(0xB2DFDB),
	TEAL_200(0x80CBC4),
	TEAL_300(0x4DB6AC),
	TEAL_400(0x26A69A),
	TEAL_500(0x009688),
	TEAL_600(0x00897B),
	TEAL_700(0x00796B),
	TEAL_800(0x00695C),
	TEAL_900(0x004D40),
	TEAL_A100(0xA7FFEB),
	TEAL_A200(0x64FFDA),
	TEAL_A400(0x1DE9B6),
	TEAL_A700(0x00BFA5),
	
	GREEN_50(0xE8F5E9),
	GREEN_100(0xC8E6C9),
	GREEN_200(0xA5D6A7),
	GREEN_300(0x81C784),
	GREEN_400(0x66BB6A),
	GREEN_500(0x4CAF50),
	GREEN_600(0x43A047),
	GREEN_700(0x388E3C),
	GREEN_800(0x2E7D32),
	GREEN_900(0x1B5E20),
	GREEN_A100(0xB9F6CA),
	GREEN_A200(0x69F0AE),
	GREEN_A400(0x00E676),
	GREEN_A700(0x00C853),
	
	LIGHT_GREEN_50(0xF1F8E9),
	LIGHT_GREEN_100(0xDCEDC8),
	LIGHT_GREEN_200(0xC5E1A5),
	LIGHT_GREEN_300(0xAED581),
	LIGHT_GREEN_400(0x9CCC65),
	LIGHT_GREEN_500(0x8BC34A),
	LIGHT_GREEN_600(0x7CB342),
	LIGHT_GREEN_700(0x689F38),
	LIGHT_GREEN_800(0x558B2F),
	LIGHT_GREEN_900(0x33691E),
	LIGHT_GREEN_A100(0xCCFF90),
	LIGHT_GREEN_A200(0xB2FF59),
	LIGHT_GREEN_A400(0x76FF03),
	LIGHT_GREEN_A700(0x64DD17),
	
	LIME_50(0xF9FBE7),
	LIME_100(0xF0F4C3),
	LIME_200(0xE6EE9C),
	LIME_300(0xDCE775),
	LIME_400(0xD4E157),
	LIME_500(0xCDDC39),
	LIME_600(0xC0CA33),
	LIME_700(0xAFB42B),
	LIME_800(0x9E9D24),
	LIME_900(0x827717),
	LIME_A100(0xF4FF81),
	LIME_A200(0xEEFF41),
	LIME_A400(0xC6FF00),
	LIME_A700(0xAEEA00),
	
	YELLOW_50(0xFFFDE7),
	YELLOW_100(0xFFF9C4),
	YELLOW_200(0xFFF59D),
	YELLOW_300(0xFFF176),
	YELLOW_400(0xFFEE58),
	YELLOW_500(0xFFEB3B),
	YELLOW_600(0xFDD835),
	YELLOW_700(0xFBC02D),
	YELLOW_800(0xF9A825),
	YELLOW_900(0xF57F17),
	YELLOW_A100(0xFFFF8D),
	YELLOW_A200(0xFFFF00),
	YELLOW_A400(0xFFEA00),
	YELLOW_A700(0xFFD600),
	
	AMBER_50(0xFFF8E1),
	AMBER_100(0xFFECB3),
	AMBER_200(0xFFE082),
	AMBER_300(0xFFD54F),
	AMBER_400(0xFFCA28),
	AMBER_500(0xFFC107),
	AMBER_600(0xFFB300),
	AMBER_700(0xFFA000),
	AMBER_800(0xFF8F00),
	AMBER_900(0xFF6F00),
	AMBER_A100(0xFFE57F),
	AMBER_A200(0xFFD740),
	AMBER_A400(0xFFC400),
	AMBER_A700(0xFFAB00),
	
	ORANGE_50(0xFFF3E0),
	ORANGE_100(0xFFE0B2),
	ORANGE_200(0xFFCC80),
	ORANGE_300(0xFFB74D),
	ORANGE_400(0xFFA726),
	ORANGE_500(0xFF9800),
	ORANGE_600(0xFB8C00),
	ORANGE_700(0xF57C00),
	ORANGE_800(0xEF6C00),
	ORANGE_900(0xE65100),
	ORANGE_A100(0xFFD180),
	ORANGE_A200(0xFFAB40),
	ORANGE_A400(0xFF9100),
	ORANGE_A700(0xFF6D00),
	
	DEEP_ORANGE_50(0xFBE9E7),
	DEEP_ORANGE_100(0xFFCCBC),
	DEEP_ORANGE_200(0xFFAB91),
	DEEP_ORANGE_300(0xFF8A65),
	DEEP_ORANGE_400(0xFF7043),
	DEEP_ORANGE_500(0xFF5722),
	DEEP_ORANGE_600(0xF4511E),
	DEEP_ORANGE_700(0xE64A19),
	DEEP_ORANGE_800(0xD84315),
	DEEP_ORANGE_900(0xBF360C),
	DEEP_ORANGE_A100(0xFF9E80),
	DEEP_ORANGE_A200(0xFF6E40),
	DEEP_ORANGE_A400(0xFF3D00),
	DEEP_ORANGE_A700(0xDD2C00),
	
	BROWN_50(0xEFEBE9),
	BROWN_100(0xD7CCC8),
	BROWN_200(0xBCAAA4),
	BROWN_300(0xA1887F),
	BROWN_400(0x8D6E63),
	BROWN_500(0x795548),
	BROWN_600(0x6D4C41),
	BROWN_700(0x5D4037),
	BROWN_800(0x4E342E),
	BROWN_900(0x3E2723),
	
	GREY_50(0xFAFAFA),
	GREY_100(0xF5F5F5),
	GREY_200(0xEEEEEE),
	GREY_300(0xE0E0E0),
	GREY_400(0xBDBDBD),
	GREY_500(0x9E9E9E),
	GREY_600(0x757575),
	GREY_700(0x616161),
	GREY_800(0x424242),
	GREY_900(0x212121),
	
	BLUE_GREY_50(0xECEFF1),
	BLUE_GREY_100(0xCFD8DC),
	BLUE_GREY_200(0xB0BEC5),
	BLUE_GREY_300(0x90A4AE),
	BLUE_GREY_400(0x78909C),
	BLUE_GREY_500(0x607D8B),
	BLUE_GREY_600(0x546E7A),
	BLUE_GREY_700(0x455A64),
	BLUE_GREY_800(0x37474F),
	BLUE_GREY_900(0x263238),
	
	WHITE(0xFFFFFF),
	BLACK(0x000000);
	
	private Color color;
	
	Colours(int color) {
		this.color = new Color(color);
	}
	
	public Color getColor() {
		return color;
	}
}
