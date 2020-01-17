package rdboboia.sep;

import java.io.File;

public class FilePath {
	public static final String BB_FILE_PATH = "C:\\Program Files (x86)\\Steam\\steamapps\\common\\SpaceEngineers\\Content\\Data";
	public static final String H_FILE_PATH = "D:\\Steam\\steamapps\\common\\SpaceEngineers\\Content\\Data";

	public static final String CURRENT_PATH = H_FILE_PATH;

	private FilePath() {

	}

	public static File getComponentsFile() {
		return new File(CURRENT_PATH + "\\Components.sbc");
	}

	public static File getCubeBlocksFile() {
		return new File(CURRENT_PATH + "\\CubeBlocks\\CubeBlocks.sbc");
	}
	
	public static File getCubeBlocksEnergyFile() {
		return new File(CURRENT_PATH + "\\CubeBlocks\\CubeBlocks_Energy.sbc");
	}
}
