del out\* /s /q
cmd /c javac -d ./out/ TicketAnalyzer.java && java -cp ./out/ TicketAnalyzer
timeout /T -1