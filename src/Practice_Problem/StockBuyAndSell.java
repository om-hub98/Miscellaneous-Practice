package Practice_Problem;

import java.util.*;

public class StockBuyAndSell {
    public static void main(String[] args) {
        List<String> listOfEvents = Arrays.asList("BUY googl 20", "BUY aapl 50", "CHANGE googl 6", "QUERY",
                "SELL aapl 10", "CHANGE aapl -2", "QUERY");

        List<Integer> result = StockExchange.getProfitAndLoss(listOfEvents);
        System.out.println("Result : "+result);

    }
}

class StockExchange {
    public static List<Integer> getProfitAndLoss(List<String> events){
        List<Integer> resultList = new ArrayList<>();
        Map<String, Integer> portfolio = new HashMap<>();
        int changeInProfitLoss = 0;

        for(String event : events){
            String[] splitEvent = event.split(" ");
            String type = splitEvent[0];

            if(type == "QUERY"){
                resultList.add(changeInProfitLoss);
            }else {
                String company = splitEvent[1];
                Integer unit = Integer.parseInt(splitEvent[2]);
                switch (type) {
                    case "BUY":
                        portfolio.put(company, portfolio.getOrDefault(company, 0) + unit);
                        break;

                    case "SELL":
                        portfolio.put(company, portfolio.getOrDefault(company, 0) - unit);
                        break;

                    case "CHANGE":
                        if (portfolio.containsKey(company)) {
                            changeInProfitLoss += unit * portfolio.get(company);
                        }
                        break;

                    default:
                        break;
                }
            }
        }
        return resultList;
    }
}
