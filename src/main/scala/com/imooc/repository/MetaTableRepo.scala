package com.imooc.repository

import com.imooc.domain.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepo extends CrudRepository[MetaTable,Integer]{

}
