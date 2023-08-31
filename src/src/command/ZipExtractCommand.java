package src.command;

import src.ConsoleHelper;
import src.ZipFileManager;
import src.exception.WrongZipFileException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipExtractCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        try {
            ConsoleHelper.writeMessage("Распаковка архива.");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Введите полное имя архива или директории для распаковки: ");

            Path sourcePath = Paths.get(ConsoleHelper.readString());
            zipFileManager.extractAll(sourcePath);

            ConsoleHelper.writeMessage("Архив распакован.");

        } catch (WrongZipFileException e) {
            ConsoleHelper.writeMessage("Вы неверно указали имя файла или директории.");
        }
    }
}
