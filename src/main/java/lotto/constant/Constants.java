package lotto.constant;

public final class Constants {

    public static final String REGEX_ONLY_NUMBER = "^[0-9]*$";
    public static final int MIN_LOTTO_NUMBER = 1;
    public static final int MAX_LOTTO_NUMBER = 45;
    public static final int LOTTO_COUNT = 6;
    public static final int LOTTO_PRICE = 1000;

    public static final int NUM_TO_MATCH1TH = 6;
    public static final int NUM_TO_MATCH2TH = 5;
    public static final int NUM_TO_MATCH3TH = 5;
    public static final int NUM_TO_MATCH4TH = 4;
    public static final int NUM_TO_MATCH5TH = 3;

    public static final int FIFTH_PLACE_PRIZE = 5000;
    public static final int FOURTH_PLACE_PRIZE = 50000;
    public static final int THIRD_PLACE_PRIZE = 1500000;
    public static final int SECOND_PLACE_PRIZE = 30000000;
    public static final int FIRST_PLACE_PRIZE = 2000000000;


    public static final String PURCHASE_MESSAGE = "구입금액을 입력해 주세요.";
    public static final String PURCHASE_CONFIRM_MESSAGE = "개를 구매했습니다.";
    public static final String WINNING_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";
    public static final String BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";
    public static final String WINNING_STATISTICS_MESSAGE = "당첨 통계\n---";

    public static final String FIRST_PLACE_MESSAGE = "6개 일치 (2,000,000,000원) - ";
    public static final String SECOND_PLACE_MESSAGE = "5개 일치, 보너스 볼 일치 (30,000,000원) - ";
    public static final String THIRD_PLACE_MESSAGE = "5개 일치 (1,500,000원) - ";
    public static final String FOURTH_PLACE_MESSAGE = "4개 일치 (50,000원) - ";
    public static final String FIFTH_PLACE_MESSAGE = "3개 일치 (5,000원) - ";

    public static final String ERROR_MESSAGE = "[ERROR]";
    public static final String INVALID_COST_ERROR_MESSAGE = " 1000원 단위로 입력해야합니다.";
    public static final String INVALID_INPUT_ERROR_MESSAGE = " 올바르지 않은 입력입니다.";
    public static final String INVALID_LENGTH_ERROR_MESSAGE = " 6개의 번호를 입력해야 합니다.";
    public static final String DUPLICATED_NUMBER_ERROR_MESSAGE = " 중복되는 번호가 있습니다.";
    public static final String OUT_OF_RANGE_ERROR_MESSAGE = " 1 ~ 45 사이의 값을 입력해주세요";

}
