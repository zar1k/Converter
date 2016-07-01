package com.gmail.andreyzarazka.converter;

public class ConverterBean {
    private String result;
    private String conversionAmount;
    private String buttonLabel;

    private String convert(String data) {
        final double CONVERSION_FACTOR = 39.3701;
        String result = null;
        try {
            double meters = Double.parseDouble(data);
            double inches = CONVERSION_FACTOR * meters;
            String inchesString = Double.toString(inches);
            result = data + " m = " + inchesString + " in";
            setConversionAmount("CONVERSION RESULT");
            setButtonLabel("Convert another number");
        } catch (NumberFormatException e) {
            result = "\"" + data + "\" is not a number.";
            if (data.isEmpty()) {
                result = "You forgot to specify the number of meters.";
            }
            setConversionAmount("CONVERSION FAILED");
            setButtonLabel("Try once more");
        }
        return result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        String inchesString = convert(result);
        this.result = inchesString;
    }

    public String getButtonLabel() {
        return buttonLabel;
    }

    public void setButtonLabel(String buttonLabel) {
        this.buttonLabel = buttonLabel;
    }

    public String getConversionAmount() {
        return conversionAmount;
    }

    public void setConversionAmount(String conversionAmount) {
        this.conversionAmount = conversionAmount;
    }
}
