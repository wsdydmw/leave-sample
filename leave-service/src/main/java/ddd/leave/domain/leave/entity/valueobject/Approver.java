package ddd.leave.domain.leave.entity.valueobject;

import ddd.leave.domain.person.entity.Person;
import ddd.leave.domain.person.repository.po.PersonPO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 值对象，除了属性集之外，还可以有简单的数据查询和转换服务
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Approver {

    String personId;
    String personName;
    int level;

    public static Approver fromPerson(Person person){
        Approver approver = new Approver();
        approver.setPersonId(person.getPersonId());
        approver.setPersonName(person.getPersonName());
        approver.setLevel(person.getRoleLevel());
        return approver;
    }

}
