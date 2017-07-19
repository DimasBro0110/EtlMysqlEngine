package com.dimas.brosalin.production.reader;

import com.dimas.brosalin.production.model.DimCustomer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.io.BufferedReader;
import java.nio.Buffer;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */
public class DimCustomerReader implements ItemReader<DimCustomer>{

    private DimCustomer dimCustomer;
    private BufferedReader bufferedReader;
    private String lineSeparator;
    private String stringQuote;

    @Override
    public DimCustomer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        assert bufferedReader != null;
        String wholeLine = bufferedReader.readLine();
        if(wholeLine != null){
            String[] parts = wholeLine.split(lineSeparator);
            // 0 -25
            dimCustomer.setCustomerKey(parts[0].replace("©", ""));
            dimCustomer.setCustomerAccountId(parts[1].replace("©", ""));
            dimCustomer.setCustomerCardOpenDate(parts[2].replace("©", ""));
            dimCustomer.setCustomerGenderType(parts[3].replace("©", ""));
            dimCustomer.setCustomerBirthDate(parts[4].replace("©", ""));
            dimCustomer.setCustomerBirthPlace(parts[5].replace("©", ""));
            dimCustomer.setCustomerMaritalStatus(parts[6].replace("©", ""));
            dimCustomer.setCustomerEducation(parts[7].replace("©", ""));
            dimCustomer.setCustomerCitizenship(parts[8].replace("©", ""));
            dimCustomer.setCustomerEmployer(parts[9].replace("©", ""));
            dimCustomer.setCustomerMobilePhoneAvail(parts[10].replace("©", ""));
            dimCustomer.setCustomerHomePhoneAvail(parts[11].replace("©", ""));
            dimCustomer.setCustomerEmailAvail(parts[12].replace("©", ""));
            dimCustomer.setCustomerDoNotPhone(parts[13].replace("©", ""));
            dimCustomer.setCustomerDoNotSMS(parts[14].replace("©", ""));
            dimCustomer.setCustomerDoNotEmail(parts[15].replace("©", ""));
            dimCustomer.setCustomerDoNotPostalMail(parts[16].replace("©", ""));
            dimCustomer.setCustomerDoNotBulkEmail(parts[17].replace("©", ""));
            dimCustomer.setCustomerDoNotBulkPostalMail(parts[18].replace("©", ""));
            dimCustomer.setCustomerDoNotBannerInternetBank(parts[19].replace("©", ""));
            dimCustomer.setCustomerDoNotCommunicate(parts[20].replace("©", ""));
            dimCustomer.setCustomerDoNotEmailInternetBank(parts[21].replace("©", ""));
            dimCustomer.setCustomerDoNotPersonalChannel(parts[22].replace("©", ""));
            dimCustomer.setCustomerCDW_ID(parts[23].replace("©", ""));
            dimCustomer.setCustomerDBOID(parts[24].replace("©", ""));
            dimCustomer.setCustomerIsEurop(parts[25].replace("©", ""));
            return dimCustomer;
        }else {
            bufferedReader.close();
            return null;
        }
    }

    public void setDimCustomer(DimCustomer dimCustomer) {
        this.dimCustomer = dimCustomer;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public void setLineSeparator(String lineSeparator) {
        this.lineSeparator = lineSeparator;
    }

    public void setStringQuote(String stringQuote) {
        this.stringQuote = stringQuote;
    }
}
