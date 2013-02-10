/**
 * 
 */
package info.colleoni.basketstats.service;

import info.colleoni.basketstats.domain.Member;
import info.colleoni.basketstats.persistence.CRUDMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class TenantService.
 *
 * @author andrea.colleoni
 */
@Service
public class MemberService extends CRUDService<Member>{

	@Autowired
	private CRUDMapper<Member> memberMapper;

	@Override
	protected CRUDMapper<Member> getElementMapper() {
		return memberMapper;
	}
	
}
