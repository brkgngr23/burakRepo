package com.base;

import com.data.GetData;
import com.driver.Chrome;

public class BaseTest {

  public void  openURL(){
      new Chrome().open(GetData.URL);
  }
}
