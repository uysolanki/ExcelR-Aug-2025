package day42jdbc;

public class DataAccessException extends Exception
{
public DataAccessException(String errorMessage)
{
	super(errorMessage);
}
}
