package com.dimas.brosalin.production.writer;

import com.dimas.brosalin.production.model.DimProductGroup;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */
public class DimProductGroupWriter implements ItemWriter<DimProductGroup> {

    @Override
    public void write(List<? extends DimProductGroup> list) throws Exception {

    }

}
