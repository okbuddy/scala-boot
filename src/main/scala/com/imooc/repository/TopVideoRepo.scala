package com.imooc.repository

import com.imooc.domain.TopVideo
import org.springframework.data.repository.CrudRepository

trait TopVideoRepo extends CrudRepository[TopVideo,String]{

}
