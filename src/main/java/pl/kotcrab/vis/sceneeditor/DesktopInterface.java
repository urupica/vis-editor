package pl.kotcrab.vis.sceneeditor;


import pl.kotcrab.vis.sceneeditor.serializer.ObjectsData;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Json;

/**
 * Funcitons that are not avaiable on GWT, muse be implemented via this interface
 * @author Pawel Pastuszak
 *
 */
public interface DesktopInterface
{
	public void createBackupFile(String TAG, FileHandle sceneFile, String backupFolderPath);
	public boolean saveJsonDataToFile(String TAG, FileHandle sceneFile, Json json, ObjectsData data);
	public boolean lastChanceSave();
}